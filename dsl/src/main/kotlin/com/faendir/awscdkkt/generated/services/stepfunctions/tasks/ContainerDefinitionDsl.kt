package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinition
import software.amazon.awscdk.services.stepfunctions.tasks.ContainerDefinitionOptions

@Generated
public fun containerDefinition(options: ContainerDefinitionOptions): ContainerDefinition =
    ContainerDefinition(options)

@Generated
public fun buildContainerDefinition(initializer: @AwsCdkDsl ContainerDefinition.Builder.() -> Unit):
    ContainerDefinition = ContainerDefinition.Builder.create().apply(initializer).build()
