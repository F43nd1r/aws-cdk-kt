package com.faendir.awscdkkt.services.managedblockchain

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
  initializer: CfnMember.() -> Unit = {},
): CfnMember = CfnMember(this, id, props).apply(initializer)
