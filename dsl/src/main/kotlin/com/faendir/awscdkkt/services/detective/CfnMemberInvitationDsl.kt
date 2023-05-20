@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.detective

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.detective.CfnMemberInvitation
import software.amazon.awscdk.services.detective.CfnMemberInvitationProps
import software.constructs.Construct

public fun Construct.cfnMemberInvitation(
  id: String,
  props: CfnMemberInvitationProps,
  initializer: CfnMemberInvitation.() -> Unit = {},
): CfnMemberInvitation = CfnMemberInvitation(this, id, props).apply(initializer)
