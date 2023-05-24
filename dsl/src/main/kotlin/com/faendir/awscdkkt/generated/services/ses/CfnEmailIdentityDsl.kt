package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import software.amazon.awscdk.services.ses.CfnEmailIdentityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEmailIdentity(id: String, props: CfnEmailIdentityProps): CfnEmailIdentity =
    CfnEmailIdentity(this, id, props)

@Generated
public fun Construct.cfnEmailIdentity(
  id: String,
  props: CfnEmailIdentityProps,
  initializer: @AwsCdkDsl CfnEmailIdentity.() -> Unit,
): CfnEmailIdentity = CfnEmailIdentity(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEmailIdentity(id: String, initializer: @AwsCdkDsl
    CfnEmailIdentity.Builder.() -> Unit): CfnEmailIdentity = CfnEmailIdentity.Builder.create(this,
    id).apply(initializer).build()
