@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.accessanalyzer

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps
import software.constructs.Construct

public fun Construct.cfnAnalyzer(
  id: String,
  props: CfnAnalyzerProps,
  initializer: CfnAnalyzer.() -> Unit = {},
): CfnAnalyzer = CfnAnalyzer(this, id, props).apply(initializer)
