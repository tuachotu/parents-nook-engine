package dataStore

import model.NookParticipant

trait NookDataStore {
  def addParticipant(c: NookParticipant): NookDataStore
  def summary: List[String]
}

case class LocalNookDataStore(participants: Map[String, NookParticipant]) extends NookDataStore {
  def participantCount: Int = participants.size
  def addParticipant(p: NookParticipant): NookDataStore = {
    LocalNookDataStore(participants + (p.id -> p))
  }
  def summary: List[String] = participants.values.toList.sortBy(_.name).map(_.name)
}
