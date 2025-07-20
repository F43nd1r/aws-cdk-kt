package com.faendir.awscdkkt.generated.services.managedblockchain

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnNode
import software.amazon.awscdk.services.managedblockchain.CfnNodeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNode(
  id: String,
  props: CfnNodeProps,
  initializer: @AwsCdkDsl CfnNode.() -> Unit = {},
): CfnNode = CfnNode(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNode(id: String, initializer: @AwsCdkDsl CfnNode.Builder.() -> Unit = {}): CfnNode = CfnNode.Builder.create(this, id).apply(initializer).build()
