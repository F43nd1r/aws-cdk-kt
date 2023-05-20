@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.managedblockchain

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnMember
import software.amazon.awscdk.services.managedblockchain.CfnMemberProps
import software.constructs.Construct

public fun Construct.cfnMember(
  id: String,
  props: CfnMemberProps,
  initializer: CfnMember.() -> Unit = {},
): CfnMember = CfnMember(this, id, props).apply(initializer)
