package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.DefaultStackSynthesizer
import software.amazon.awscdk.DefaultStackSynthesizerProps

@Generated
public fun defaultStackSynthesizer(props: DefaultStackSynthesizerProps): DefaultStackSynthesizer =
    DefaultStackSynthesizer(props)

@Generated
public fun defaultStackSynthesizer(): DefaultStackSynthesizer = DefaultStackSynthesizer()

@Generated
public fun buildDefaultStackSynthesizer(initializer: @AwsCdkDsl
    DefaultStackSynthesizer.Builder.() -> Unit): DefaultStackSynthesizer =
    DefaultStackSynthesizer.Builder.create().apply(initializer).build()
