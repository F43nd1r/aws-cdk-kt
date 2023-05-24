package com.faendir.awscdkkt.generated.services.accessanalyzer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzer
import software.amazon.awscdk.services.accessanalyzer.CfnAnalyzerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnalyzer(id: String, props: CfnAnalyzerProps): CfnAnalyzer =
    CfnAnalyzer(this, id, props)

@Generated
public fun Construct.cfnAnalyzer(
  id: String,
  props: CfnAnalyzerProps,
  initializer: @AwsCdkDsl CfnAnalyzer.() -> Unit,
): CfnAnalyzer = CfnAnalyzer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAnalyzer(id: String, initializer: @AwsCdkDsl
    CfnAnalyzer.Builder.() -> Unit): CfnAnalyzer = CfnAnalyzer.Builder.create(this,
    id).apply(initializer).build()
