package com.faendir.awscdkkt.generated.services.aps

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.aps.CfnAnomalyDetector
import software.amazon.awscdk.services.aps.CfnAnomalyDetectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnomalyDetector(
  id: String,
  props: CfnAnomalyDetectorProps,
  initializer: @AwsCdkDsl CfnAnomalyDetector.() -> Unit = {},
): CfnAnomalyDetector = CfnAnomalyDetector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAnomalyDetector(id: String, initializer: @AwsCdkDsl CfnAnomalyDetector.Builder.() -> Unit = {}): CfnAnomalyDetector = CfnAnomalyDetector.Builder.create(this, id).apply(initializer).build()
