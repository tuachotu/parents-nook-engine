
package model

sealed trait NookParticipantRole
case object PARENT extends  NookParticipantRole
case object PLAY_FACILITATOR extends  NookParticipantRole
case object PARTNER extends  NookParticipantRole
case object VENUE extends  NookParticipantRole
case object KID extends  NookParticipantRole
case object MANAGEMENT extends  NookParticipantRole


case class NookParticipant(id: String, name: String, role: NookParticipantRole)

