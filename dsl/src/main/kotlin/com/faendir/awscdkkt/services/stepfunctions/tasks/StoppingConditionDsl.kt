@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition

public fun stoppingCondition(initializer: StoppingCondition.Builder.() -> Unit): StoppingCondition =
    StoppingCondition.builder().apply(initializer).build()
