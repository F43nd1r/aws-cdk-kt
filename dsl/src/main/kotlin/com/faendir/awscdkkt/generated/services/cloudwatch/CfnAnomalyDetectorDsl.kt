package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnomalyDetector(id: String, initializer: @AwsCdkDsl CfnAnomalyDetector.() -> Unit = {}): CfnAnomalyDetector = CfnAnomalyDetector(this, id).apply(initializer)

@Generated
public fun Construct.cfnAnomalyDetector(
  id: String,
  props: CfnAnomalyDetectorProps,
  initializer: @AwsCdkDsl CfnAnomalyDetector.() -> Unit = {},
): CfnAnomalyDetector = CfnAnomalyDetector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAnomalyDetector(id: String, initializer: @AwsCdkDsl CfnAnomalyDetector.Builder.() -> Unit = {}): CfnAnomalyDetector = CfnAnomalyDetector.Builder.create(this, id).apply(initializer).build()
