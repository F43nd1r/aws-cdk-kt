package com.faendir.awscdkkt.generated.services.devopsguru

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration
import software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLogAnomalyDetectionIntegration(id: String, initializer: @AwsCdkDsl CfnLogAnomalyDetectionIntegration.() -> Unit = {}): CfnLogAnomalyDetectionIntegration = CfnLogAnomalyDetectionIntegration(this, id).apply(initializer)

@Generated
public fun Construct.cfnLogAnomalyDetectionIntegration(
  id: String,
  props: CfnLogAnomalyDetectionIntegrationProps,
  initializer: @AwsCdkDsl CfnLogAnomalyDetectionIntegration.() -> Unit = {},
): CfnLogAnomalyDetectionIntegration = CfnLogAnomalyDetectionIntegration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLogAnomalyDetectionIntegration(id: String, initializer: @AwsCdkDsl CfnLogAnomalyDetectionIntegration.Builder.() -> Unit = {}): CfnLogAnomalyDetectionIntegration = CfnLogAnomalyDetectionIntegration.Builder.create(this, id).apply(initializer).build()
