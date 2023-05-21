package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.VersionWeight

@Generated
public fun versionWeight(initializer: VersionWeight.Builder.() -> Unit = {}): VersionWeight =
    VersionWeight.builder().apply(initializer).build()
