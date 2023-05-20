@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
