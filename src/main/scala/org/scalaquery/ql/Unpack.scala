package org.scalaquery.ql

/**
 * A type class that encodes the unpacking `From => To` of a `Query[From]` to
 * its result element type `To`. It is only needed at compile-time. All of its
 * values at run-time are `null`.
 */
sealed trait =>> [-From, +To]

object =>> extends LowPriority_=>> {
  //implicit final def unpackTable[T]: AbstractTable[T] =>> T = null

  implicit final def unpackProjection2[T1,T2]: Projection2[T1,T2] =>> (T1,T2) = null
  implicit final def unpackProjection3[T1,T2,T3]: Projection3[T1,T2,T3] =>> (T1,T2,T3) = null
  implicit final def unpackProjection4[T1,T2,T3,T4]: Projection4[T1,T2,T3,T4] =>> (T1,T2,T3,T4) = null
  implicit final def unpackProjection5[T1,T2,T3,T4,T5]: Projection5[T1,T2,T3,T4,T5] =>> (T1,T2,T3,T4,T5) = null
  implicit final def unpackProjection6[T1,T2,T3,T4,T5,T6]: Projection6[T1,T2,T3,T4,T5,T6] =>> (T1,T2,T3,T4,T5,T6) = null
  implicit final def unpackProjection7[T1,T2,T3,T4,T5,T6,T7]: Projection7[T1,T2,T3,T4,T5,T6,T7] =>> (T1,T2,T3,T4,T5,T6,T7) = null
  implicit final def unpackProjection8[T1,T2,T3,T4,T5,T6,T7,T8]: Projection8[T1,T2,T3,T4,T5,T6,T7,T8] =>> (T1,T2,T3,T4,T5,T6,T7,T8) = null
  implicit final def unpackProjection9[T1,T2,T3,T4,T5,T6,T7,T8,T9]: Projection9[T1,T2,T3,T4,T5,T6,T7,T8,T9] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9) = null
  implicit final def unpackProjection10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]: Projection10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = null
  implicit final def unpackProjection11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]: Projection11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = null
  implicit final def unpackProjection12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]: Projection12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = null
  implicit final def unpackProjection13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]: Projection13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = null
  implicit final def unpackProjection14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]: Projection14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = null
  implicit final def unpackProjection15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]: Projection15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = null
  implicit final def unpackProjection16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]: Projection16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = null
  implicit final def unpackProjection17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]: Projection17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) = null
  implicit final def unpackProjection18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]: Projection18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) = null
  implicit final def unpackProjection19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]: Projection19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19) = null
  implicit final def unpackProjection20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]: Projection20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20) = null
  implicit final def unpackProjection21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]: Projection21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21) = null
  implicit final def unpackProjection22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]: Projection22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22] =>> (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22) = null

  final type CanUnpack[-T] = T =>> _
}

trait LowPriority_=>> {
  implicit final def unpackPrimitive[T : TypeMapper]: T =>> T = null
  implicit final def unpackColumnBase[T]: ColumnBase[T] =>> T = null

  implicit final def unpackTuple2[T1,T2, U1,U2](implicit u1: T1 =>> U1, u2: T2 =>> U2): (T1,T2) =>> (U1,U2) = null
  implicit final def unpackTuple3[T1,T2,T3, U1,U2,U3](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3): (T1,T2,T3) =>> (U1,U2,U3) = null
  implicit final def unpackTuple4[T1,T2,T3,T4, U1,U2,U3,U4](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4): (T1,T2,T3,T4) =>> (U1,U2,U3,U4) = null
  implicit final def unpackTuple5[T1,T2,T3,T4,T5, U1,U2,U3,U4,U5](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5): (T1,T2,T3,T4,T5) =>> (U1,U2,U3,U4,U5) = null
  implicit final def unpackTuple6[T1,T2,T3,T4,T5,T6, U1,U2,U3,U4,U5,U6](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6): (T1,T2,T3,T4,T5,T6) =>> (U1,U2,U3,U4,U5,U6) = null
  implicit final def unpackTuple7[T1,T2,T3,T4,T5,T6,T7, U1,U2,U3,U4,U5,U6,U7](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7): (T1,T2,T3,T4,T5,T6,T7) =>> (U1,U2,U3,U4,U5,U6,U7) = null
  implicit final def unpackTuple8[T1,T2,T3,T4,T5,T6,T7,T8, U1,U2,U3,U4,U5,U6,U7,U8](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8): (T1,T2,T3,T4,T5,T6,T7,T8) =>> (U1,U2,U3,U4,U5,U6,U7,U8) = null
  implicit final def unpackTuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9, U1,U2,U3,U4,U5,U6,U7,U8,U9](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9): (T1,T2,T3,T4,T5,T6,T7,T8,T9) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9) = null
  implicit final def unpackTuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10) = null
  implicit final def unpackTuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11) = null
  implicit final def unpackTuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12) = null
  implicit final def unpackTuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12, u13: T13 =>> U13): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13) = null
  implicit final def unpackTuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12, u13: T13 =>> U13, u14: T14 =>> U14): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14) = null
  implicit final def unpackTuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12, u13: T13 =>> U13, u14: T14 =>> U14, u15: T15 =>> U15): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15) = null
  implicit final def unpackTuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12, u13: T13 =>> U13, u14: T14 =>> U14, u15: T15 =>> U15, u16: T16 =>> U16): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16) = null
  implicit final def unpackTuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12, u13: T13 =>> U13, u14: T14 =>> U14, u15: T15 =>> U15, u16: T16 =>> U16, u17: T17 =>> U17): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17) = null
  implicit final def unpackTuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12, u13: T13 =>> U13, u14: T14 =>> U14, u15: T15 =>> U15, u16: T16 =>> U16, u17: T17 =>> U17, u18: T18 =>> U18): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18) = null
  implicit final def unpackTuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12, u13: T13 =>> U13, u14: T14 =>> U14, u15: T15 =>> U15, u16: T16 =>> U16, u17: T17 =>> U17, u18: T18 =>> U18, u19: T19 =>> U19): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19) = null
  implicit final def unpackTuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12, u13: T13 =>> U13, u14: T14 =>> U14, u15: T15 =>> U15, u16: T16 =>> U16, u17: T17 =>> U17, u18: T18 =>> U18, u19: T19 =>> U19, u20: T20 =>> U20): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20) = null
  implicit final def unpackTuple21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12, u13: T13 =>> U13, u14: T14 =>> U14, u15: T15 =>> U15, u16: T16 =>> U16, u17: T17 =>> U17, u18: T18 =>> U18, u19: T19 =>> U19, u20: T20 =>> U20, u21: T21 =>> U21): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21) = null
  implicit final def unpackTuple22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22, U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22](implicit u1: T1 =>> U1, u2: T2 =>> U2, u3: T3 =>> U3, u4: T4 =>> U4, u5: T5 =>> U5, u6: T6 =>> U6, u7: T7 =>> U7, u8: T8 =>> U8, u9: T9 =>> U9, u10: T10 =>> U10, u11: T11 =>> U11, u12: T12 =>> U12, u13: T13 =>> U13, u14: T14 =>> U14, u15: T15 =>> U15, u16: T16 =>> U16, u17: T17 =>> U17, u18: T18 =>> U18, u19: T19 =>> U19, u20: T20 =>> U20, u21: T21 =>> U21, u22: T22 =>> U22): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22) =>> (U1,U2,U3,U4,U5,U6,U7,U8,U9,U10,U11,U12,U13,U14,U15,U16,U17,U18,U19,U20,U21,U22) = null
}
