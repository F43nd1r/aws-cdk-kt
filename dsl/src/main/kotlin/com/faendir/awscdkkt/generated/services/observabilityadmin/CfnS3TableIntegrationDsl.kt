package com.faendir.awscdkkt.generated.services.observabilityadmin

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.observabilityadmin.CfnS3TableIntegration
import software.amazon.awscdk.services.observabilityadmin.CfnS3TableIntegrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnS3TableIntegration(
  id: String,
  props: CfnS3TableIntegrationProps,
  initializer: @AwsCdkDsl CfnS3TableIntegration.() -> Unit = {},
): CfnS3TableIntegration = CfnS3TableIntegration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnS3TableIntegration(id: String, initializer: @AwsCdkDsl CfnS3TableIntegration.Builder.() -> Unit = {}): CfnS3TableIntegration = CfnS3TableIntegration.Builder.create(this, id).apply(initializer).build()
