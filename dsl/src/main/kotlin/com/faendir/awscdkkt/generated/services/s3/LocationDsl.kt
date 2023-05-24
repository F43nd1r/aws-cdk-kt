package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.Location

@Generated
public fun buildLocation(initializer: @AwsCdkDsl Location.Builder.() -> Unit): Location =
    Location.Builder().apply(initializer).build()
