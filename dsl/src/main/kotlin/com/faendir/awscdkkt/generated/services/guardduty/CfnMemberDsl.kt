package com.faendir.awscdkkt.generated.services.guardduty

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnMember
import software.amazon.awscdk.services.guardduty.CfnMemberProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMember(id: String, props: CfnMemberProps): CfnMember = CfnMember(this, id,
    props)

@Generated
public fun Construct.cfnMember(
  id: String,
  props: CfnMemberProps,
  initializer: @AwsCdkDsl CfnMember.() -> Unit,
): CfnMember = CfnMember(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMember(id: String, initializer: @AwsCdkDsl
    CfnMember.Builder.() -> Unit): CfnMember = CfnMember.Builder.create(this,
    id).apply(initializer).build()
