package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.TaskDefinitionProps

@Generated
public fun buildTaskDefinitionProps(initializer: @AwsCdkDsl TaskDefinitionProps.Builder.() -> Unit):
    TaskDefinitionProps = TaskDefinitionProps.Builder().apply(initializer).build()
