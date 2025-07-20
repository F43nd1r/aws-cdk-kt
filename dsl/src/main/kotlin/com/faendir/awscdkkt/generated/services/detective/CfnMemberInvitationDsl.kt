package com.faendir.awscdkkt.generated.services.detective

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnMemberInvitation.() -> Unit = {},
): CfnMemberInvitation = CfnMemberInvitation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMemberInvitation(id: String, initializer: @AwsCdkDsl CfnMemberInvitation.Builder.() -> Unit = {}): CfnMemberInvitation = CfnMemberInvitation.Builder.create(this, id).apply(initializer).build()
