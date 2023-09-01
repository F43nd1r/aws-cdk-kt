package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnEnvironment

@Generated
public fun buildTagsProperty(initializer: @AwsCdkDsl CfnEnvironment.TagsProperty.Builder.() -> Unit
    = {}): CfnEnvironment.TagsProperty =
    CfnEnvironment.TagsProperty.Builder().apply(initializer).build()
