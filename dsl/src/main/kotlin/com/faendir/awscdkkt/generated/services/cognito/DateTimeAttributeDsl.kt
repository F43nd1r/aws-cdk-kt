package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CustomAttributeProps
import software.amazon.awscdk.services.cognito.DateTimeAttribute

@Generated
public fun dateTimeAttribute(): DateTimeAttribute = DateTimeAttribute()

@Generated
public fun dateTimeAttribute(props: CustomAttributeProps): DateTimeAttribute =
    DateTimeAttribute(props)

@Generated
public fun buildDateTimeAttribute(initializer: @AwsCdkDsl DateTimeAttribute.Builder.() -> Unit):
    DateTimeAttribute = DateTimeAttribute.Builder.create().apply(initializer).build()
