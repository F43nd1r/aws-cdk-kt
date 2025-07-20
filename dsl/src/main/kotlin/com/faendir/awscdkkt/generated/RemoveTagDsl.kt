package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemoveTag

@Generated
public fun buildRemoveTag(key: String, initializer: @AwsCdkDsl RemoveTag.Builder.() -> Unit = {}): RemoveTag = RemoveTag.Builder.create(key).apply(initializer).build()
