package com.baeldung.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.baeldung.openapi.model.Data1;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &#x60;CloudEvent&#x60; specific properties for the &#x60;Notification&#x60;. 
 */

@Schema(name = "TransportDocumentNotification", description = "`CloudEvent` specific properties for the `Notification`. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-30T15:24:55.896324973+02:00[Europe/Paris]", comments = "Generator version: 7.8.0")
public class TransportDocumentNotification {

  /**
   * The version of the CloudEvents specification which the event uses. This enables the interpretation of the context. Compliant event producers MUST use a value of `1.0` when referring to this version of the specification.  Currently, this attribute will only have the 'major' and 'minor' version numbers included in it. This allows for 'patch' changes to the specification to be made without changing this property's value in the serialization. Note: for 'release candidate' releases a suffix might be used for testing purposes. 
   */
  public enum SpecversionEnum {
    _1_0("1.0");

    private String value;

    SpecversionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SpecversionEnum fromValue(String value) {
      for (SpecversionEnum b : SpecversionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SpecversionEnum specversion;

  private String id;

  private String source;

  /**
   * This attribute contains a value describing the type of event related to the originating occurrence. Often this attribute is used for routing, observability, policy enforcement, etc. The format of this is producer defined and might include information such as the version of the type - see [Versioning of CloudEvents in the Primer](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/primer.md#versioning-of-cloudevents) for more information. 
   */
  public enum TypeEnum {
    ORG_DCSA_TRANSPORT_DOCUMENT_V3("org.dcsa.transport-document.v3");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  /**
   * Content type of `data` value. This attribute enables `data` to carry any type of content, whereby format and encoding might differ from that of the chosen event format. For example, an event rendered using the [JSON envelope](formats/json-format.md#3-envelope) format might carry an XML payload in `data`, and the consumer is informed by this attribute being set to \"application/xml\". The rules for how `data` content is rendered for different `datacontenttype` values are defined in the event format specifications; for example, the JSON event format defines the relationship in [section 3.1](formats/json-format.md#31-handling-of-data).  For some binary mode protocol bindings, this field is directly mapped to the respective protocol's content-type metadata property. Normative rules for the binary mode and the content-type metadata mapping can be found in the respective protocol.  In some event formats the `datacontenttype` attribute MAY be omitted. For example, if a JSON format event has no`datacontenttype` attribute, then it is implied that the `data` is a JSON value conforming to the \"application/json\" media type. In other words: a JSON-format event with no `datacontenttype` is exactly equivalent to one with `datacontenttype=\"application/json\"`.  When translating an event message with no `datacontenttype` attribute to a different format or protocol binding, the target `datacontenttype` SHOULD be set explicitly to the implied `datacontenttype` of the source. 
   */
  public enum DatacontenttypeEnum {
    APPLICATION_JSON("application/json");

    private String value;

    DatacontenttypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DatacontenttypeEnum fromValue(String value) {
      for (DatacontenttypeEnum b : DatacontenttypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DatacontenttypeEnum datacontenttype;

  private String subscriptionReference;

  private Data1 data;

  public TransportDocumentNotification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TransportDocumentNotification(SpecversionEnum specversion, String id, String source, TypeEnum type, OffsetDateTime time, DatacontenttypeEnum datacontenttype, String subscriptionReference, Data1 data) {
    this.specversion = specversion;
    this.id = id;
    this.source = source;
    this.type = type;
    this.time = time;
    this.datacontenttype = datacontenttype;
    this.subscriptionReference = subscriptionReference;
    this.data = data;
  }

  public TransportDocumentNotification specversion(SpecversionEnum specversion) {
    this.specversion = specversion;
    return this;
  }

  /**
   * The version of the CloudEvents specification which the event uses. This enables the interpretation of the context. Compliant event producers MUST use a value of `1.0` when referring to this version of the specification.  Currently, this attribute will only have the 'major' and 'minor' version numbers included in it. This allows for 'patch' changes to the specification to be made without changing this property's value in the serialization. Note: for 'release candidate' releases a suffix might be used for testing purposes. 
   * @return specversion
   */
  @NotNull 
  @Schema(name = "specversion", example = "1.0", description = "The version of the CloudEvents specification which the event uses. This enables the interpretation of the context. Compliant event producers MUST use a value of `1.0` when referring to this version of the specification.  Currently, this attribute will only have the 'major' and 'minor' version numbers included in it. This allows for 'patch' changes to the specification to be made without changing this property's value in the serialization. Note: for 'release candidate' releases a suffix might be used for testing purposes. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("specversion")
  public SpecversionEnum getSpecversion() {
    return specversion;
  }

  public void setSpecversion(SpecversionEnum specversion) {
    this.specversion = specversion;
  }

  public TransportDocumentNotification id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the event. Producers MUST ensure that `source` + `id` is unique for each distinct event. If a duplicate event is re-sent (e.g. due to a network error) it MAY have the same `id`. Consumers MAY assume that Events with identical `source` and `id` are duplicates. 
   * @return id
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "id", example = "3cecb101-7a1a-43a4-9d62-e88a131651e2", description = "Identifies the event. Producers MUST ensure that `source` + `id` is unique for each distinct event. If a duplicate event is re-sent (e.g. due to a network error) it MAY have the same `id`. Consumers MAY assume that Events with identical `source` and `id` are duplicates. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransportDocumentNotification source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Identifies the context in which an event happened. Often this will include information such as the type of the event source, the organization publishing the event or the process that produced the event. The exact syntax and semantics behind the data encoded in the URI is defined by the event producer.  Producers MUST ensure that `source` + `id` is unique for each distinct event.  An application MAY assign a unique `source` to each distinct producer, which makes it easy to produce unique IDs since no other producer will have the same source. The application MAY use UUIDs, URNs, DNS authorities or an application-specific scheme to create unique `source` identifiers.  A source MAY include more than one producer. In that case the producers MUST collaborate to ensure that `source` + `id` is unique for each distinct event. 
   * @return source
   */
  @NotNull @Size(max = 4096) 
  @Schema(name = "source", example = "https://member.com/", description = "Identifies the context in which an event happened. Often this will include information such as the type of the event source, the organization publishing the event or the process that produced the event. The exact syntax and semantics behind the data encoded in the URI is defined by the event producer.  Producers MUST ensure that `source` + `id` is unique for each distinct event.  An application MAY assign a unique `source` to each distinct producer, which makes it easy to produce unique IDs since no other producer will have the same source. The application MAY use UUIDs, URNs, DNS authorities or an application-specific scheme to create unique `source` identifiers.  A source MAY include more than one producer. In that case the producers MUST collaborate to ensure that `source` + `id` is unique for each distinct event. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public TransportDocumentNotification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * This attribute contains a value describing the type of event related to the originating occurrence. Often this attribute is used for routing, observability, policy enforcement, etc. The format of this is producer defined and might include information such as the version of the type - see [Versioning of CloudEvents in the Primer](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/primer.md#versioning-of-cloudevents) for more information. 
   * @return type
   */
  @NotNull 
  @Schema(name = "type", example = "org.dcsa.transport-document.v3", description = "This attribute contains a value describing the type of event related to the originating occurrence. Often this attribute is used for routing, observability, policy enforcement, etc. The format of this is producer defined and might include information such as the version of the type - see [Versioning of CloudEvents in the Primer](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/primer.md#versioning-of-cloudevents) for more information. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public TransportDocumentNotification time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp of when the occurrence happened. If the time of the occurrence cannot be determined then this attribute MAY be set to some other time (such as the current time) by the CloudEvents producer, however all producers for the same `source` MUST be consistent in this respect. In other words, either they all use the actual time of the occurrence or they all use the same algorithm to determine the value used. 
   * @return time
   */
  @NotNull @Valid 
  @Schema(name = "time", example = "2018-04-05T17:31Z", description = "Timestamp of when the occurrence happened. If the time of the occurrence cannot be determined then this attribute MAY be set to some other time (such as the current time) by the CloudEvents producer, however all producers for the same `source` MUST be consistent in this respect. In other words, either they all use the actual time of the occurrence or they all use the same algorithm to determine the value used. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public TransportDocumentNotification datacontenttype(DatacontenttypeEnum datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  /**
   * Content type of `data` value. This attribute enables `data` to carry any type of content, whereby format and encoding might differ from that of the chosen event format. For example, an event rendered using the [JSON envelope](formats/json-format.md#3-envelope) format might carry an XML payload in `data`, and the consumer is informed by this attribute being set to \"application/xml\". The rules for how `data` content is rendered for different `datacontenttype` values are defined in the event format specifications; for example, the JSON event format defines the relationship in [section 3.1](formats/json-format.md#31-handling-of-data).  For some binary mode protocol bindings, this field is directly mapped to the respective protocol's content-type metadata property. Normative rules for the binary mode and the content-type metadata mapping can be found in the respective protocol.  In some event formats the `datacontenttype` attribute MAY be omitted. For example, if a JSON format event has no`datacontenttype` attribute, then it is implied that the `data` is a JSON value conforming to the \"application/json\" media type. In other words: a JSON-format event with no `datacontenttype` is exactly equivalent to one with `datacontenttype=\"application/json\"`.  When translating an event message with no `datacontenttype` attribute to a different format or protocol binding, the target `datacontenttype` SHOULD be set explicitly to the implied `datacontenttype` of the source. 
   * @return datacontenttype
   */
  @NotNull 
  @Schema(name = "datacontenttype", example = "application/json", description = "Content type of `data` value. This attribute enables `data` to carry any type of content, whereby format and encoding might differ from that of the chosen event format. For example, an event rendered using the [JSON envelope](formats/json-format.md#3-envelope) format might carry an XML payload in `data`, and the consumer is informed by this attribute being set to \"application/xml\". The rules for how `data` content is rendered for different `datacontenttype` values are defined in the event format specifications; for example, the JSON event format defines the relationship in [section 3.1](formats/json-format.md#31-handling-of-data).  For some binary mode protocol bindings, this field is directly mapped to the respective protocol's content-type metadata property. Normative rules for the binary mode and the content-type metadata mapping can be found in the respective protocol.  In some event formats the `datacontenttype` attribute MAY be omitted. For example, if a JSON format event has no`datacontenttype` attribute, then it is implied that the `data` is a JSON value conforming to the \"application/json\" media type. In other words: a JSON-format event with no `datacontenttype` is exactly equivalent to one with `datacontenttype=\"application/json\"`.  When translating an event message with no `datacontenttype` attribute to a different format or protocol binding, the target `datacontenttype` SHOULD be set explicitly to the implied `datacontenttype` of the source. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("datacontenttype")
  public DatacontenttypeEnum getDatacontenttype() {
    return datacontenttype;
  }

  public void setDatacontenttype(DatacontenttypeEnum datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  public TransportDocumentNotification subscriptionReference(String subscriptionReference) {
    this.subscriptionReference = subscriptionReference;
    return this;
  }

  /**
   * The reference of the subscription that has triggered this event 
   * @return subscriptionReference
   */
  @NotNull @Pattern(regexp = "^\\S(?:.*\\S)?$") @Size(max = 100) 
  @Schema(name = "subscriptionReference", example = "30675492-50ff-4e17-a7df-7a487a8ad343", description = "The reference of the subscription that has triggered this event ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subscriptionReference")
  public String getSubscriptionReference() {
    return subscriptionReference;
  }

  public void setSubscriptionReference(String subscriptionReference) {
    this.subscriptionReference = subscriptionReference;
  }

  public TransportDocumentNotification data(Data1 data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public Data1 getData() {
    return data;
  }

  public void setData(Data1 data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransportDocumentNotification transportDocumentNotification = (TransportDocumentNotification) o;
    return Objects.equals(this.specversion, transportDocumentNotification.specversion) &&
        Objects.equals(this.id, transportDocumentNotification.id) &&
        Objects.equals(this.source, transportDocumentNotification.source) &&
        Objects.equals(this.type, transportDocumentNotification.type) &&
        Objects.equals(this.time, transportDocumentNotification.time) &&
        Objects.equals(this.datacontenttype, transportDocumentNotification.datacontenttype) &&
        Objects.equals(this.subscriptionReference, transportDocumentNotification.subscriptionReference) &&
        Objects.equals(this.data, transportDocumentNotification.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specversion, id, source, type, time, datacontenttype, subscriptionReference, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransportDocumentNotification {\n");
    sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
    sb.append("    subscriptionReference: ").append(toIndentedString(subscriptionReference)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

