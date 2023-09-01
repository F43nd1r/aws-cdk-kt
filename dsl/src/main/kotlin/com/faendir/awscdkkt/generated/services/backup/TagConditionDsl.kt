package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.TagCondition

@Generated
public fun buildTagCondition(initializer: @AwsCdkDsl TagCondition.Builder.() -> Unit = {}):
    TagCondition = TagCondition.Builder().apply(initializer).build()
