package com.faendir.awscdkkt.generated.services.memorydb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnReservedNode
import software.amazon.awscdk.services.memorydb.CfnReservedNodeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReservedNode(id: String, initializer: @AwsCdkDsl CfnReservedNode.() -> Unit = {}): CfnReservedNode = CfnReservedNode(this, id).apply(initializer)

@Generated
public fun Construct.cfnReservedNode(
  id: String,
  props: CfnReservedNodeProps,
  initializer: @AwsCdkDsl CfnReservedNode.() -> Unit = {},
): CfnReservedNode = CfnReservedNode(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReservedNode(id: String, initializer: @AwsCdkDsl CfnReservedNode.Builder.() -> Unit = {}): CfnReservedNode = CfnReservedNode.Builder.create(this, id).apply(initializer).build()
