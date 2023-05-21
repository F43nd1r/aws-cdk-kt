package com.faendir.awscdkkt.services.quicksight

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
  initializer: CfnAnalysis.() -> Unit = {},
): CfnAnalysis = CfnAnalysis(this, id, props).apply(initializer)
