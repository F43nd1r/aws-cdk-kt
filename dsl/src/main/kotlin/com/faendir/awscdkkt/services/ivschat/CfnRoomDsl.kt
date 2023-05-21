package com.faendir.awscdkkt.services.ivschat

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivschat.CfnRoom
import software.amazon.awscdk.services.ivschat.CfnRoomProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRoom(id: String, initializer: CfnRoom.() -> Unit = {}): CfnRoom =
    CfnRoom(this, id).apply(initializer)

@Generated
public fun Construct.cfnRoom(
  id: String,
  props: CfnRoomProps,
  initializer: CfnRoom.() -> Unit = {},
): CfnRoom = CfnRoom(this, id, props).apply(initializer)
