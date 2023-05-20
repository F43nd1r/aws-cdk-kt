@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
