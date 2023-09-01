package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import software.amazon.awscdk.services.quicksight.CfnAnalysisProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnalysis(
  id: String,
  props: CfnAnalysisProps,
  initializer: @AwsCdkDsl CfnAnalysis.() -> Unit = {},
): CfnAnalysis = CfnAnalysis(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAnalysis(id: String, initializer: @AwsCdkDsl
    CfnAnalysis.Builder.() -> Unit = {}): CfnAnalysis = CfnAnalysis.Builder.create(this,
    id).apply(initializer).build()
