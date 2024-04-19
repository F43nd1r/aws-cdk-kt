package com.faendir.awscdkkt.generated.services.cleanrooms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplate
import software.amazon.awscdk.services.cleanrooms.CfnPrivacyBudgetTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPrivacyBudgetTemplate(
  id: String,
  props: CfnPrivacyBudgetTemplateProps,
  initializer: @AwsCdkDsl CfnPrivacyBudgetTemplate.() -> Unit = {},
): CfnPrivacyBudgetTemplate = CfnPrivacyBudgetTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPrivacyBudgetTemplate(id: String, initializer: @AwsCdkDsl
    CfnPrivacyBudgetTemplate.Builder.() -> Unit = {}): CfnPrivacyBudgetTemplate =
    CfnPrivacyBudgetTemplate.Builder.create(this, id).apply(initializer).build()
