package com.faendir.awscdkkt.services.guardduty

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnMember
import software.amazon.awscdk.services.guardduty.CfnMemberProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMember(
  id: String,
  props: CfnMemberProps,
  initializer: CfnMember.() -> Unit = {},
): CfnMember = CfnMember(this, id, props).apply(initializer)
