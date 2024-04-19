package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnLicenseEndpoint
import software.amazon.awscdk.services.deadline.CfnLicenseEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLicenseEndpoint(
  id: String,
  props: CfnLicenseEndpointProps,
  initializer: @AwsCdkDsl CfnLicenseEndpoint.() -> Unit = {},
): CfnLicenseEndpoint = CfnLicenseEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLicenseEndpoint(id: String, initializer: @AwsCdkDsl
    CfnLicenseEndpoint.Builder.() -> Unit = {}): CfnLicenseEndpoint =
    CfnLicenseEndpoint.Builder.create(this, id).apply(initializer).build()
