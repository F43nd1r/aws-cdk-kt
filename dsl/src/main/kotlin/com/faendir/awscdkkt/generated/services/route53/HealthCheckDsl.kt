package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.HealthCheck
import software.amazon.awscdk.services.route53.HealthCheckProps
import software.constructs.Construct

@Generated
public fun Construct.healthCheck(
  id: String,
  props: HealthCheckProps,
  initializer: @AwsCdkDsl HealthCheck.() -> Unit = {},
): HealthCheck = HealthCheck(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHealthCheck(id: String, initializer: @AwsCdkDsl HealthCheck.Builder.() -> Unit = {}): HealthCheck = HealthCheck.Builder.create(this, id).apply(initializer).build()
