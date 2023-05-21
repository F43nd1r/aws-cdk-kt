package com.faendir.awscdkkt.services.detective

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.detective.CfnMemberInvitation
import software.amazon.awscdk.services.detective.CfnMemberInvitationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMemberInvitation(
  id: String,
  props: CfnMemberInvitationProps,
  initializer: CfnMemberInvitation.() -> Unit = {},
): CfnMemberInvitation = CfnMemberInvitation(this, id, props).apply(initializer)
