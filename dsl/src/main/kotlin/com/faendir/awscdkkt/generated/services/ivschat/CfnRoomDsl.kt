package com.faendir.awscdkkt.generated.services.ivschat

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivschat.CfnRoom
import software.amazon.awscdk.services.ivschat.CfnRoomProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRoom(id: String, initializer: @AwsCdkDsl CfnRoom.() -> Unit = {}): CfnRoom = CfnRoom(this, id).apply(initializer)

@Generated
public fun Construct.cfnRoom(
  id: String,
  props: CfnRoomProps,
  initializer: @AwsCdkDsl CfnRoom.() -> Unit = {},
): CfnRoom = CfnRoom(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRoom(id: String, initializer: @AwsCdkDsl CfnRoom.Builder.() -> Unit = {}): CfnRoom = CfnRoom.Builder.create(this, id).apply(initializer).build()
