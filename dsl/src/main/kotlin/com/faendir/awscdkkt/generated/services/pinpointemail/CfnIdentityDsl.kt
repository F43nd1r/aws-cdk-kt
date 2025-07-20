package com.faendir.awscdkkt.generated.services.pinpointemail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnIdentity
import software.amazon.awscdk.services.pinpointemail.CfnIdentityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdentity(
  id: String,
  props: CfnIdentityProps,
  initializer: @AwsCdkDsl CfnIdentity.() -> Unit = {},
): CfnIdentity = CfnIdentity(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdentity(id: String, initializer: @AwsCdkDsl CfnIdentity.Builder.() -> Unit = {}): CfnIdentity = CfnIdentity.Builder.create(this, id).apply(initializer).build()
