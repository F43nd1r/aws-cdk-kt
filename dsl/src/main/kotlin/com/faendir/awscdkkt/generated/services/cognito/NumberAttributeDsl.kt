package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.NumberAttribute
import software.amazon.awscdk.services.cognito.NumberAttributeProps

@Generated
public fun numberAttribute(): NumberAttribute = NumberAttribute()

@Generated
public fun numberAttribute(props: NumberAttributeProps): NumberAttribute = NumberAttribute(props)

@Generated
public fun buildNumberAttribute(initializer: @AwsCdkDsl NumberAttribute.Builder.() -> Unit):
    NumberAttribute = NumberAttribute.Builder.create().apply(initializer).build()
