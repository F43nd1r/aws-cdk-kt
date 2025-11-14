package com.faendir.awscdkkt.generated.interfaces.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.ecs.TaskDefinitionReference

@Generated
public fun buildTaskDefinitionReference(initializer: @AwsCdkDsl TaskDefinitionReference.Builder.() -> Unit = {}): TaskDefinitionReference = TaskDefinitionReference.Builder().apply(initializer).build()
