package com.faendir.awscdkkt.generated.services.managedblockchain

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnMember
import software.amazon.awscdk.services.managedblockchain.CfnMemberProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMember(
  id: String,
  props: CfnMemberProps,
  initializer: @AwsCdkDsl CfnMember.() -> Unit = {},
): CfnMember = CfnMember(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMember(id: String, initializer: @AwsCdkDsl CfnMember.Builder.() -> Unit
    = {}): CfnMember = CfnMember.Builder.create(this, id).apply(initializer).build()
