package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnRecipe

@Generated
public
    fun conditionExpressionProperty(initializer: CfnRecipe.ConditionExpressionProperty.Builder.() -> Unit
    = {}): CfnRecipe.ConditionExpressionProperty =
    CfnRecipe.ConditionExpressionProperty.builder().apply(initializer).build()
