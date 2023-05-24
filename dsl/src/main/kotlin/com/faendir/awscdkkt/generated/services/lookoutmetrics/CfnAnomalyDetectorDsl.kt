package com.faendir.awscdkkt.generated.services.lookoutmetrics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnomalyDetector(id: String, props: CfnAnomalyDetectorProps):
    CfnAnomalyDetector = CfnAnomalyDetector(this, id, props)

@Generated
public fun Construct.cfnAnomalyDetector(
  id: String,
  props: CfnAnomalyDetectorProps,
  initializer: @AwsCdkDsl CfnAnomalyDetector.() -> Unit,
): CfnAnomalyDetector = CfnAnomalyDetector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAnomalyDetector(id: String, initializer: @AwsCdkDsl
    CfnAnomalyDetector.Builder.() -> Unit): CfnAnomalyDetector =
    CfnAnomalyDetector.Builder.create(this, id).apply(initializer).build()
