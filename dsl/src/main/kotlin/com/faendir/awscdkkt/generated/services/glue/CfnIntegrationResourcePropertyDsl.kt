package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnIntegrationResourceProperty
import software.amazon.awscdk.services.glue.CfnIntegrationResourcePropertyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIntegrationResourceProperty(
  id: String,
  props: CfnIntegrationResourcePropertyProps,
  initializer: @AwsCdkDsl CfnIntegrationResourceProperty.() -> Unit = {},
): CfnIntegrationResourceProperty = CfnIntegrationResourceProperty(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIntegrationResourceProperty(id: String, initializer: @AwsCdkDsl CfnIntegrationResourceProperty.Builder.() -> Unit = {}): CfnIntegrationResourceProperty = CfnIntegrationResourceProperty.Builder.create(this, id).apply(initializer).build()
