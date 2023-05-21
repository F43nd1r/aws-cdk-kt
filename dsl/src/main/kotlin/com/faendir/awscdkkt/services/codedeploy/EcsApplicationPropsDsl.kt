package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.EcsApplicationProps

@Generated
public fun ecsApplicationProps(initializer: EcsApplicationProps.Builder.() -> Unit = {}):
    EcsApplicationProps = EcsApplicationProps.builder().apply(initializer).build()
