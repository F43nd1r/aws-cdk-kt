@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.identitystore

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.identitystore.CfnGroupMembership
import software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps
import software.constructs.Construct

public fun Construct.cfnGroupMembership(
  id: String,
  props: CfnGroupMembershipProps,
  initializer: CfnGroupMembership.() -> Unit = {},
): CfnGroupMembership = CfnGroupMembership(this, id, props).apply(initializer)
