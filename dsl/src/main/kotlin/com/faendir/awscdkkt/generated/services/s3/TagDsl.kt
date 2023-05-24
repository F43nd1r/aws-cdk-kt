package com.faendir.awscdkkt.generated.services.s3

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.Tag

@Generated
public fun buildTag(initializer: @AwsCdkDsl Tag.Builder.() -> Unit): Tag =
    Tag.Builder().apply(initializer).build()
