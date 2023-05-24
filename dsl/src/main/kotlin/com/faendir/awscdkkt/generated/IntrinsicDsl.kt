package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.Intrinsic
import software.amazon.awscdk.IntrinsicProps

@Generated
public fun intrinsic(`value`: Any, options: IntrinsicProps): Intrinsic = Intrinsic(value, options)

@Generated
public fun intrinsic(`value`: Any): Intrinsic = Intrinsic(value)

@Generated
public fun buildIntrinsic(`value`: Any, initializer: @AwsCdkDsl Intrinsic.Builder.() -> Unit):
    Intrinsic = Intrinsic.Builder.create(value).apply(initializer).build()
