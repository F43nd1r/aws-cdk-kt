package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.StringAttribute
import software.amazon.awscdk.services.cognito.StringAttributeProps

@Generated
public fun stringAttribute(): StringAttribute = StringAttribute()

@Generated
public fun stringAttribute(props: StringAttributeProps): StringAttribute = StringAttribute(props)

@Generated
public fun buildStringAttribute(initializer: @AwsCdkDsl StringAttribute.Builder.() -> Unit):
    StringAttribute = StringAttribute.Builder.create().apply(initializer).build()
