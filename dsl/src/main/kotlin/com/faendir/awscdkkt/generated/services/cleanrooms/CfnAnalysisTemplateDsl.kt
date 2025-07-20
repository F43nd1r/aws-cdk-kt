package com.faendir.awscdkkt.generated.services.cleanrooms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplate
import software.amazon.awscdk.services.cleanrooms.CfnAnalysisTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnalysisTemplate(
  id: String,
  props: CfnAnalysisTemplateProps,
  initializer: @AwsCdkDsl CfnAnalysisTemplate.() -> Unit = {},
): CfnAnalysisTemplate = CfnAnalysisTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAnalysisTemplate(id: String, initializer: @AwsCdkDsl CfnAnalysisTemplate.Builder.() -> Unit = {}): CfnAnalysisTemplate = CfnAnalysisTemplate.Builder.create(this, id).apply(initializer).build()
