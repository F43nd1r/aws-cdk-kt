package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnLogAnomalyDetector
import software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLogAnomalyDetector(id: String, initializer: @AwsCdkDsl
    CfnLogAnomalyDetector.() -> Unit = {}): CfnLogAnomalyDetector = CfnLogAnomalyDetector(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnLogAnomalyDetector(
  id: String,
  props: CfnLogAnomalyDetectorProps,
  initializer: @AwsCdkDsl CfnLogAnomalyDetector.() -> Unit = {},
): CfnLogAnomalyDetector = CfnLogAnomalyDetector(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLogAnomalyDetector(id: String, initializer: @AwsCdkDsl
    CfnLogAnomalyDetector.Builder.() -> Unit = {}): CfnLogAnomalyDetector =
    CfnLogAnomalyDetector.Builder.create(this, id).apply(initializer).build()
