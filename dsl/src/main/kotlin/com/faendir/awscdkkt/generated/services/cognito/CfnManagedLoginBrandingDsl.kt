package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnManagedLoginBranding
import software.amazon.awscdk.services.cognito.CfnManagedLoginBrandingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnManagedLoginBranding(
  id: String,
  props: CfnManagedLoginBrandingProps,
  initializer: @AwsCdkDsl CfnManagedLoginBranding.() -> Unit = {},
): CfnManagedLoginBranding = CfnManagedLoginBranding(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnManagedLoginBranding(id: String, initializer: @AwsCdkDsl
    CfnManagedLoginBranding.Builder.() -> Unit = {}): CfnManagedLoginBranding =
    CfnManagedLoginBranding.Builder.create(this, id).apply(initializer).build()
