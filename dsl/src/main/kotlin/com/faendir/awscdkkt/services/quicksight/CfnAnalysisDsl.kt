@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import software.amazon.awscdk.services.quicksight.CfnAnalysisProps
import software.constructs.Construct

public fun Construct.cfnAnalysis(
  id: String,
  props: CfnAnalysisProps,
  initializer: CfnAnalysis.() -> Unit = {},
): CfnAnalysis = CfnAnalysis(this, id, props).apply(initializer)
