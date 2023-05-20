@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.budgets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.budgets.CfnBudgetsAction

public
    fun iamActionDefinitionProperty(initializer: CfnBudgetsAction.IamActionDefinitionProperty.Builder.() -> Unit):
    CfnBudgetsAction.IamActionDefinitionProperty =
    CfnBudgetsAction.IamActionDefinitionProperty.builder().apply(initializer).build()
